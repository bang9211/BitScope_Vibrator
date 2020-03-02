package monitor_application;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import org.json.simple.parser.ParseException;

/**
 * 
 * MinT를 이용해 Raspberry PI를 제어하여 BitScope(BS05T)를 제어하는 프로그램
 * BNC 커넥터 인터페이스를 사용하는 진동센서의 ADC값을 읽기 위해 사용
 * 
 * @author youngtak Han <gksdudxkr@gmail.com>
 */
public class Sharing_Client {

    /**
     * @param args the command line arguments
     * @throws javax.xml.bind.JAXBException
     */
    public static void main(String[] args) throws JAXBException, ParseException, IOException {
        // TODO code application logic here
        Sharing_MinT cl = new Sharing_MinT();
        cl.Start();
    }
    
}
