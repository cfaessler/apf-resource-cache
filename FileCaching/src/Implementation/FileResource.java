package Implementation;
import Interfaces.IFileResource;

public class FileResource implements IFileResource {

	String id;
	byte[] data;

	public FileResource(String id, byte[] buffer) {
		this.data = buffer;
		this.id = id;
	}

	public byte[] getData() {
		return this.data;
	}

}
