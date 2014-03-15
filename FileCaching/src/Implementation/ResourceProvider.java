package Implementation;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import Interfaces.IFileResource;
import Interfaces.IResourceProvider;

public class ResourceProvider implements IResourceProvider{

	public IFileResource getFileResource(String id) {
		File f = new File(id);
		byte[] buffer = new byte[1024];
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			fis.read(buffer);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new FileResource(id, buffer);
	}
}
