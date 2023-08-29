interface playable {
    void methodplay();
}
class Guitar implements playable{
    @Override
    public void methodplay() {
        System.out.println("guitar");
    }
}
class Piano implements playable{
    @Override
    public void methodplay() {
        System.out.println("guitar");
    }
}
