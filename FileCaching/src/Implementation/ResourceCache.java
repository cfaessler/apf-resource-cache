package Implementation;
import java.util.HashMap;
import java.util.Map;

import Interfaces.ICache;
import Interfaces.IFileResource;

public class ResourceCache implements ICache {
	ResourceProvider provider;
	Map<String, IFileResource> cache = new HashMap<String, IFileResource>();

	public ResourceCache(ResourceProvider provider) {
		this.provider = provider;
	}

	@Override
	public void release(IFileResource r) {
		this.cache.remove(r);

	}

	@Override
	public IFileResource acquire(String id) {
		if (!this.cache.containsKey(id)) {
			System.out.println("Resource not cached");
			IFileResource fr = this.provider.getFileResource(id);
			this.cache.put(id, fr);
			return fr;
		}

		return this.cache.get(id);

	}

}
