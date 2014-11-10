package apprentice.logging.sublogging;

import apprentice.logging.MainLogging;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sublogging extends MainLogging {

  private static final Logger subloggingLogger = LoggerFactory.getLogger(Sublogging.class);

  public static void main(String ... args) {
    final Sublogging sublogging = new Sublogging();
    sublogging.logLogger();

    sublogging.logSublogger();
  }

  public Sublogging() {
    super();
  }

  public void logSublogger() {
    final String subloggingLoggerName = "Sublogging";
    subloggingLogger.error(LOGGER_IN, "error", subloggingLoggerName);
    subloggingLogger.warn(LOGGER_IN, "warn", subloggingLoggerName);
    subloggingLogger.info(LOGGER_IN, "info", subloggingLoggerName);
    subloggingLogger.debug(LOGGER_IN, "debug", subloggingLoggerName);
  }

}
