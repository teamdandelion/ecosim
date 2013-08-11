class ResourceDefinitions {
  private String[] resourceNames;
  private HashMap<String, Int> resourceIndices;

  public ResourceDefinitions(String[] resourceNames) {
    this.resourceNames = resourceNames;
    setupHashMap()
  }

  public int getResourceIndex(String resourceName){
    Int index = this.resourceIndices.get(resourceName);
    return (int) index;
  }

  public getResourceName(int resourceIndex){
    return resourceNames[resourceIndex];
  }

  private void setupHashMap(){
    resourceIndices = new HashMap();
    for (int i=0, int len=resourceNames.length;
         i<len; i++){
      resourceIndices.put(resourceNames[i], new Int(i))
    }
  }
}
