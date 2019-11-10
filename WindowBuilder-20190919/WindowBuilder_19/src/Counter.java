public class Counter {
	private int value;
	public Counter(int v){value=v;}
	public int readValue(){return value;}
        public void step(){value++;}
        public void step1(){value--;}
        public void reset() {value=0;}
}
