import com.resteasy.karco.entity.Route;
import com.resteasy.karco.repository.RouteRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Victor on 23/05/2017.
 */
public class TestRouteRepository {

    @Autowired
    RouteRepository routeRepository;

    @Test
    public void tstFindRouteByOrigin(){
        final Route r1 = new Route();
        r1.setId((long) 1);
        r1.setStatus("Completed");
        r1.setStartAddress("Paris");
        r1.setEndAddress("Marseilles");

        Route route = routeRepository.save(r1);
        Assert.assertTrue(route.getId() > 0);

        //List<Route> founds = routeRepository.findByNomLike("TOT%");
        //Assert.assertTrue(founds.size() > 0);
    }

}
