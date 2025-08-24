class Aviary {
    public void release(FlyBehaviour b) {
        b.fly();
        System.out.println("Released");
    }
}