import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class TiFile {
    byte[] fileHeader; //8 bytes
    /* 3 Bytes */
    byte[] fileDescriptor; //40 bytes
    /* 3 Bytes */
    byte[] nameMeta; //4 bytes
    byte[] queryBytes = { 0x0, 0x5 };
    byte[] programName; //9 bytes
    byte[] codeMeta; //4 bytes
    /* 1 Byte */
    byte[] programCode; //Flexible
    /* 1 Byte */
    byte lines; //1 byte
    /* EOF */


    public TiFile(String fileDescriptor, String programName, byte[] programCode)
    {
        this.fileHeader = new byte[8];

    }
    public TiFile(String path) throws Exception
    {
        FileInputStream fileStream = new FileInputStream(path);
        fileHeader = fileStream.readNBytes(8);
        fileStream.skip(3);
        fileDescriptor = fileStream.readNBytes(40);
        fileStream.skip(3);
        fileStream.skip(2); //These are the query bytes, they are always 0x0 and 0x5.
        nameMeta = fileStream.readNBytes(4);
        programName = fileStream.readNBytes(9);
        codeMeta = fileStream.readNBytes(4);
        fileStream.skip(1);
        byte len = codeMeta[3];
        programCode = fileStream.readNBytes(len);
        fileStream.skip(1);
        lines = fileStream.readNBytes(1)[0];
        fileStream.close();
    }

    public String getFileHeader()
    {
        return new String(fileHeader);
    }
    public String getFileDescriptor()
    {
        return new String(fileDescriptor);
    }
    public void setFileDescriptor(String descriptor)
    {
        fileDescriptor = new byte[40];
        byte[] strBytes = descriptor.getBytes(Charset.forName("ASCII"));
        for(int i = 0; i < strBytes.length; i++)
        {
            fileDescriptor[i] = strBytes[i];
        }
    }
    public String getProgramName()
    {
        return new String(programName);
    }
    public int getFullCodeSizeFromCodeMeta()
    {
        return codeMeta[1];
    }
    public int getCodeSizeFromCodeMeta()
    {
        return codeMeta[3];
    }
    public byte[] getProgramCode()
    {
        return programCode;
    }
    public void setProgramCode(byte[] byteCode)
    {
        //Set the metadata lenghts
        nameMeta[3] = (byte)(byteCode.length+2);
        nameMeta[1] = (byte)byteCode.length;
        codeMeta[1] = (byte)(byteCode.length+2);
        codeMeta[3] = (byte)byteCode.length;

        programCode = byteCode;

        //Count new lines
        byte lineCt = 1;
        for(byte b : byteCode)
        {
            if(b == TiToken.NEWLINE.hex)
            {
                lineCt++;
            }
        }
        lines = lineCt;
    }
    public int getLines()
    {
        return lines;
    }

    public byte[] generateNew()
    {
        ArrayList<Byte> bytes = new ArrayList<>();
        //Add file header
        for(byte b : fileHeader)
        {
            bytes.add(b);
        }
        //Pad 3 bytes
        for(byte b = 0; b < 3; b++) { bytes.add((byte)0); }
        //Add file descriptor
        for(byte b : fileDescriptor)
        {
            bytes.add(b);
        }
        //Pad 3 bytes
        for(byte b = 0; b < 3; b++) { bytes.add((byte)0); }
        //Add name metadata
        for(byte b : nameMeta)
        {
            bytes.add(b);
        }
        //Add query bytes
        for(byte b : queryBytes)
        {
            bytes.add(b);
        }
        //Add program name
        for(byte b : programName)
        {
            bytes.add(b);
        }
        //Add code meta
        for(byte b : codeMeta)
        {
            bytes.add(b);
        }
        //Pad 1 byte
        for(byte b = 0; b < 1; b++) { bytes.add((byte)0); }
        //Add program code
        for(byte b : programCode)
        {
            bytes.add(b);
        }
        //Pad 1 byte
        for(byte b = 0; b < 1; b++) { bytes.add((byte)0); }
        //Add line count byte
        bytes.add(lines);

        //Get array from arraylist
        byte[] prim = new byte[bytes.size()];
        for(int i = 0; i < prim.length; i++)
        {
            prim[i] = bytes.get(i);
        }
        return prim;
    }

    public String toString() {
        StringBuilder build = new StringBuilder();
        build.append("{'TiFile': ");
        build.append("FileHeader:[");
        for(byte b : fileHeader)
        {
            build.append(b + " ");
        }
        build.append("], ");
        build.append("FileDesc:[");
        for(byte b : fileDescriptor)
        {
            build.append(b + " ");
        }
        build.append("], ");
        build.append("NameMeta:[");
        for(byte b : nameMeta)
        {
            build.append(b + " ");
        }
        build.append("], ");
        build.append("ProgName:[");
        for(byte b : programName)
        {
            build.append(b + " ");
        }
        build.append("], ");
        build.append("CodeMeta:[");
        for(byte b : codeMeta)
        {
            build.append(b + " ");
        }
        build.append("], ");
        build.append("Code:[");
        for(byte b : programCode)
        {
            build.append(b + " ");
        }
        build.append("], ");
        build.append("Lines:[");
        build.append(""+lines);
        build.append("]");
        build.append("}");
        return build.toString();
    }
}
