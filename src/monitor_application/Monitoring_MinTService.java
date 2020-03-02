package monitor_application;

import MinT.ExternalDevice.Sensing.Vibration.MinTDriver_bitscope;
import MinTFramework.MinT;
import MinTFramework.SystemScheduler.Service;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author youngtak Han <gksdudxkr@gmail.com>
 */
class Monitoring_MinTService extends Service {

    MinT frame = MinT.getInstance();
    MinTDriver_bitscope bitScope;

    String name;
    
    JSONParser jsonParser;
    JSONObject jsonAttributes;
    String stringJSONParameters;

    public Monitoring_MinTService(MinTDriver_bitscope bitScope) throws JAXBException, ParseException, IOException {
        super("clientService");

        this.bitScope = bitScope;
    }

    @Override
    public void execute() {
        while (!Thread.currentThread().isInterrupted()) {
            double[] vibration = bitScope.getData();
            System.out.println("VIBRATION");
            for(int i = 0; i < vibration.length; i++)
            {
                System.out.println("[ " + (i + 1) + " ] " + vibration[i]);
            }
        }
    }
    
}
