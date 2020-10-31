public class SimpleCalculator {

    static int LAST;
    static int[] memorySlots = new int[20];

    // returns a sum of multiple integers
	public static int add (int... numbers) {
        int sum = 0;
        for (int i: numbers)
            sum += i;
        LAST = sum;
        return sum;
    }
    // returns a product of multiple integers
	public static int multiply (int... integers) {
        int product = 1;
        for (int i: integers )
            product *= i;
        LAST = product;
        return product;
    }
    //save most recent answer
    public static int last(){
	    return LAST;
    }
    public static void set_slot(int slotNumber){
        memorySlots[slotNumber - 1] = LAST;
    }
    public static int get_slot(int slotValue){
        return memorySlots[slotValue - 1];
    }
	public static void main(String[] args) {
        System.out.println(add(1,2));
        set_slot(1);
        System.out.println(get_slot(1));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(add(10,20));
        set_slot(2);
        System.out.println(get_slot(2));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(add(100,200));
        System.out.println(get_slot(1));
        System.out.println(get_slot(2));
        System.out.println(last());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
