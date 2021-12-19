package workbook;

public class Extend13 {

	public static void main(String[] args) {
		
		// SubSampleExceptionのスーパークラスがSampleException
		// この例外処理ではSampleException・SubSampleExceptionどちらが発生しても、
		// 1番目のcatch文で処理され、2番目のcatch文に処理が移行されない
		// ⇒到達不可能の旨、エラーが発生
		try {
			sample();
			sub();
		} catch (SampleException e) {
			System.out.println("A");
		} catch (SubSampleException e) {
			System.out.println("B");
		}
	}
	
	private static void sample() throws SampleException {
		throw new SampleException();
	}
	
	private static void sub() throws SubSampleException {
		throw new SubSampleException();
	}

}
