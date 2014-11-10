package apprentice.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainLogging {

  private static final Logger loggingLogger = LoggerFactory.getLogger(MainLogging.class);

  protected static final String LOGGER_IN = "Logger in {} level ({})";

  public static void main(String ... args) {
    final MainLogging mainLogging = new MainLogging();
    mainLogging.logLogger();
  }

  public void logLogger() {
    final String loggingLoggerName = "Logging";
    loggingLogger.error(LOGGER_IN, "error", loggingLoggerName);
    loggingLogger.warn(LOGGER_IN, "warn", loggingLoggerName);
    loggingLogger.info(LOGGER_IN, "info", loggingLoggerName);
    loggingLogger.debug(LOGGER_IN, "debug", loggingLoggerName);
  }

}
