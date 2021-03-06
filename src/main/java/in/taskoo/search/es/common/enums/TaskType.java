package in.taskoo.search.es.common.enums;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TaskType {

  IN_PERSON(0), REMOTE(1);

  @JsonCreator
  public static TaskType toEnum(Integer value) {
    return Arrays.stream(TaskType.values()).filter(type -> type.getId().equals(value)).findFirst().orElseThrow(null);
  }

  private final Integer id;
  
  @JsonValue
  public String getTaskType() {
    return this.toString();
  }

}
