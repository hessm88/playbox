package apprentice.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

  private static final Logger logger = LoggerFactory.getLogger(Logging.class);
  private static final String MY_MESSAGE = "my message";

  public static void main(String ... args) {
    logger.info("Here I am {}", "available in http");
    logger.debug("DEBUG!");
  }
}