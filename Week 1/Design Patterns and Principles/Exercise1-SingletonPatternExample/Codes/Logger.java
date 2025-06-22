public class Logger {

    private  static Logger logger;
    private Logger(){

    }
    public  static Logger getInstance(){
        if (logger==null){
            synchronized(Logger.class){
                if(logger==null){
                    logger=new Logger();
                }        
            }
        }
        return logger;    
    }

}