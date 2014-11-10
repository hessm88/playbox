package apprentice.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

  private static final Logger logger = LoggerFactory.getLogger(Logging.class);

  public static void main(String ... args) {
    final String className = "Logging";
    logger.error("Logger reports error in {}", className);
    logger.warn("Logger reports warn in {}", className);
    logger.info("Logger reports info in {}", className);
    logger.debug("Logger reports DEBUG in {}", className);
  }
}