package Interfaces;

public interface ICache {
	public void release(IFileResource r);
	public IFileResource acquire(String id);

}
