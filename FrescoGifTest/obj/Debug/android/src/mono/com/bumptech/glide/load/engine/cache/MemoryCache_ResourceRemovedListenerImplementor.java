package mono.com.bumptech.glide.load.engine.cache;


public class MemoryCache_ResourceRemovedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onResourceRemoved:(Lcom/bumptech/glide/load/engine/Resource;)V:GetOnResourceRemoved_Lcom_bumptech_glide_load_engine_Resource_Handler:Com.Bumptech.Glide.Load.Engine.Cache.IMemoryCacheResourceRemovedListenerInvoker, Glide\n" +
			"";
		mono.android.Runtime.register ("Com.Bumptech.Glide.Load.Engine.Cache.IMemoryCacheResourceRemovedListenerImplementor, Glide, Version=4.1.1.0, Culture=neutral, PublicKeyToken=null", MemoryCache_ResourceRemovedListenerImplementor.class, __md_methods);
	}


	public MemoryCache_ResourceRemovedListenerImplementor ()
	{
		super ();
		if (getClass () == MemoryCache_ResourceRemovedListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Bumptech.Glide.Load.Engine.Cache.IMemoryCacheResourceRemovedListenerImplementor, Glide, Version=4.1.1.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onResourceRemoved (com.bumptech.glide.load.engine.Resource p0)
	{
		n_onResourceRemoved (p0);
	}

	private native void n_onResourceRemoved (com.bumptech.glide.load.engine.Resource p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
