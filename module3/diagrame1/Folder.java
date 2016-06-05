package ua.goit.module3.diagrame1;

import java.util.List;

/**
 * Created by Alex on 04.06.2016.
 */
public class Folder {
    List<File> fileList;
    List<Folder> folderListr;

    public List<File> getFileList()
    {
        return fileList;
    }

    public List<Folder> getFolderListr()
    {
        return folderListr;
    }

    public boolean addFile(File file)
    {
        return fileList.add(file);
    }

    public boolean removeFile(File file)
    {
        return fileList.remove(file);
    }


}
