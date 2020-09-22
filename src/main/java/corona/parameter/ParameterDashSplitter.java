package corona.parameter;

import java.util.List;
import java.util.Arrays;

import com.beust.jcommander.converters.IParameterSplitter;

class ParameterDashSplitter implements IParameterSplitter {
  public List<String> split(String value) {
    return Arrays.asList(value.split("-"));
  }
}
