package monitor_application;

import MinT.ExternalDevice.Sensing.Vibration.MinTDriver_bitscope;
import MinTFramework.MinT;
import MinTFramework.Util.PlatformInfo;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import org.json.simple.parser.ParseException;

/**
 * 
 * @author youngtak Han <gksdudxkr@gmail.com>
 */
public class Sharing_MinT extends MinT{
    
    public Sharing_MinT() throws JAXBException, ParseException, IOException{
        init();
    }

    private void init() throws JAXBException, ParseException, IOException {
        
        //MinT
        //**********************************************************************
        MinTDriver_bitscope bitScope = new MinTDriver_bitscope();
        this.addDevice(bitScope);
        this.putService(new Monitoring_MinTService(bitScope));
        //**********************************************************************
        
        System.out.println("Current disk Total Size: " + PlatformInfo.getCurrentDiskTotalSpace());
        System.out.println("Current disk Usable Size: " + PlatformInfo.getCurrentDiskUsableSpace());
        System.out.println("Current disk Free Size: " + PlatformInfo.getCurrentDiskFreeSpace());
        System.out.println("Used Memory: " + PlatformInfo.getUsageMemory());
    }
}    
