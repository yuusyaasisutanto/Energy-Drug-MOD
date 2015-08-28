package yuusyaasisutanto.EnergyDrugMOD;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Logger {
	private static org.apache.logging.log4j.Logger logger;
	
	public static void regestry(FMLPreInitializationEvent e){
		logger = e.getModLog();
	}
	
	public static void log( String s )
    {
       logger.log( org.apache.logging.log4j.Level.OFF, s );
    }
	 
    public static void log( org.apache.logging.log4j.Level lv, String s )
    {
        logger.log( lv, s );
    }
 
    public static void log( org.apache.logging.log4j.Level lv, String s, Object... params )
    {
        logger.log( lv, s, params );
    }
}
