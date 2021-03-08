package EFScript.Ti;

import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

import EFScript.Logger;

public class TiFile {
    byte[] fileHeader; //8 bytes
    private final int FILE_HEADER_SIZE = 8;
    /* 3 Bytes */
    byte[] fileDescriptor; //40 bytes
    private final int FILE_DESCRIPTOR_SIZE = 40;
    /* 3 Bytes */
    byte[] nameMeta; //4 bytes
    private final int META_SIZE = 4;
    byte[] queryBytes = { 0x0, 0x5 };
    byte[] programName; //9 bytes
    private final int PROG_NAME_SIZE = 9;
    byte[] codeMeta; //4 bytes
    /* 1 Byte */
    byte[] programCode; //Flexible
    /* 1 Byte */
    byte lines; //1 byte
    /* EOF */


    public TiFile(String fileDescriptor, String programName, byte[] programCode)
    {
        Logger.Log("Initialized new TiFile from scratch");
        this.fileHeader = "**TI83F*".getBytes(Charset.forName("ASCII"));
        this.fileDescriptor = fileDescriptor.getBytes(Charset.forName("ASCII"));
        this.programName = programName.getBytes(Charset.forName("ASCII"));
        this.nameMeta = new byte[4];
        this.codeMeta = new byte[4];
        this.setProgramCode(programCode);

    }
    public TiFile(String path) throws Exception
    {
        Logger.Log("Reading existing .8xp file \""+path+"\"");
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
        Logger.Log("Generating new .8xp file");
        ArrayList<Byte> bytes = new ArrayList<>();
        //Add file header
        for(int i = 0; i < FILE_HEADER_SIZE; i++)
        {
            if(this.fileHeader.length <= i)
                bytes.add((byte)0);
            else
                bytes.add(this.fileHeader[i]);
        }
        //Pad 3 bytes
        for(byte b = 0; b < 3; b++) { bytes.add((byte)0); }
        //Add file descriptor
        for(int i = 0; i < FILE_DESCRIPTOR_SIZE; i++)
        {
            if(this.fileDescriptor.length <= i)
                bytes.add((byte)0);
            else
                bytes.add(this.fileDescriptor[i]);
        }
        //Pad 3 bytes
        for(byte b = 0; b < 3; b++) { bytes.add((byte)0); }
        //Add name metadata
        for(int i = 0; i < META_SIZE; i++)
        {
            if(this.nameMeta.length <= i)
                bytes.add((byte)0);
            else
                bytes.add(this.nameMeta[i]);
        }
        //Add query bytes
        for(byte b : queryBytes)
        {
            bytes.add(b);
        }
        //Add program name
        for(int i = 0; i < PROG_NAME_SIZE; i++)
        {
            if(this.programName.length <= i)
                bytes.add((byte)0);
            else
                bytes.add(this.programName[i]);
        }
        //Add code meta
        for(int i = 0; i < META_SIZE; i++)
        {
            bytes.add(codeMeta[i]);
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
        Logger.Log("Generated new .8xp file");
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
