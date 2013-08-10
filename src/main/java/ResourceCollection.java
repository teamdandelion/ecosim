import java.util.ArrayList;
import java.util.Collection;

class ResourceCollection {
    // n resources
    private Collection<Long> resources;
    private static final int N_RESOURCE_TYPES = 0;
    
    /**
     * is initialized with n different resources each with value of 0
     */
    public ResourceCollection() {
        this.resources = new ArrayList<Long>();
        final Long INITIAL_VAL = 0L;
        for	(int i = 0; i < N_RESOURCE_TYPES; ++i) {
        	this.resources.add(INITIAL_VAL);
        }
    }
}

