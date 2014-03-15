import Implementation.ResourceCache;
import Implementation.ResourceProvider;
import Interfaces.ICache;
import Interfaces.IFileResource;

public class ResourceUser {

	public static void main(String[] args) {
		ResourceProvider provider = new ResourceProvider();
		ICache cache = new ResourceCache(provider);

		for (int i = 0; i < 3; ++i) {
			IFileResource r = cache.acquire("C:/temp/applog.txt");
			System.out.println(new String(r.getData()));
		}
	}

}
