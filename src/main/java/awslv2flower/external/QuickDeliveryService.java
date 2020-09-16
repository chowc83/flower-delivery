
package awslv2flower.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="quickdelivery", url="${api.url.quickdelivery}")
public interface QuickDeliveryService {

    @RequestMapping(method= RequestMethod.POST, path="/quickDeliveries")
    public void quickRequest(@RequestBody QuickDelivery quickDelivery);

}