package thread.selftest.ex16;

class Chicks {
	    synchronized void yack(long id) {
	      for(int x = 1; x < 3; x++) {
	        System.out.print(id + " ");
	        Thread.yield();
//	        System.out.print(id + " ");
	      }
	    }
	 }
