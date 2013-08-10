class ResourceCollection implements Resources {
    private static final int N_RESOURCE_TYPES = 10;
    private int[] resources;
    public ResourceCollection() {
        this.resources = new int[N_RESOURCE_TYPES];
    }
}