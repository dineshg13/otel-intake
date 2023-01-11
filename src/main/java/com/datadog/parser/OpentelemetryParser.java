package com.datadog.parser;

import com.google.protobuf.InvalidProtocolBufferException;
import io.opentelemetry.proto.trace.v1.TracesData;

public class OpentelemetryParser {

  public void parser(byte[] bytes) {
    try {
      TracesData tracesData = TracesData.parseFrom(bytes);
    } catch (InvalidProtocolBufferException e) {
      throw new RuntimeException(e);
    }
  }
}
