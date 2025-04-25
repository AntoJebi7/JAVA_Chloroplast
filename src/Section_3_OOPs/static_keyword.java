package Section_3_OOPs;

public class static_keyword {
    public static void main(String[] args) {
        // belongs to the class
        friend f1 = new friend("anto");
        friend f2 = new friend("a");
        friend f3 = new friend("b");
        System.out.println(f1.name); // 3 by using static else 1
        friend.showFriends();
    }
}
