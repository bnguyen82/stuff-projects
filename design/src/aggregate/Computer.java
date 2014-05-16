package aggregate;

import java.util.List;

public class Computer {
	private CPU cpu;
	private String memoryCapacity;
	public Computer() {
		
	}
	public void start(){
		//Start CPU
		cpu.warmUp();
		System.out.print("Memory: "+memoryCapacity);
	}
	public void stop() {
		//Stop CPU
		cpu.coldDown();
	}
	public void initializeCPU() {
		if (cpu == null){
			cpu = new CPU();
		}
	}
	class CPU {
		private String name;
		private List<String> windowsSupportList;
		public void warmUp() {
			// TODO Auto-generated method stub
			for (String win : windowsSupportList) {
				System.out.print(win);
			}
		}
		public void coldDown() {
			// TODO Auto-generated method stub

		}
	}
	
}
