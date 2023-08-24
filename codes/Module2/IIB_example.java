// Java program to illustrate
// Instance Initialization Block
class GfG {
	// Instance Initialization Block
	{
		System.out.println("IIB block");
	}

	// Constructor of GfG class
	GfG() { System.out.println("Constructor Called"); }
	public static void main(String[] args)
	{
		GfG a = new GfG();
                GfG b = new GfG();
	}
}

