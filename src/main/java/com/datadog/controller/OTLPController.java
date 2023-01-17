package com.datadog.controller;

import com.googlecode.protobuf.format.JsonFormat;
import io.opentelemetry.proto.metrics.v1.MetricsData;
import io.opentelemetry.proto.trace.v1.TracesData;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OTLPController {

  @RequestMapping(method = RequestMethod.POST, value = "/v1/traces", headers = "content-type=application/x-protobuf")
  public void otlpProtoTraces(InputStream inputStream) throws IOException {
    BufferedInputStream in = new BufferedInputStream(inputStream);
    TracesData tracesData = TracesData.parseFrom(in.readAllBytes());
    log.info("traceData:" + tracesData);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/v1/metrics", headers = "content-type=application/x-protobuf")
  public void otlpProtoMetrics(InputStream inputStream) throws IOException {
    BufferedInputStream in = new BufferedInputStream(inputStream);
    MetricsData metricsData = MetricsData.parseFrom(in.readAllBytes());
    log.info("metricsData:" + metricsData);
  }

  private final JsonFormat jsonFormat = new JsonFormat();

  @RequestMapping(method = RequestMethod.POST, value = "/v1/traces", headers = "content-type=application/json")
  public void otlpJsonTraces(InputStream inputStream) throws IOException {
      TracesData.Builder builder = TracesData.newBuilder();
      jsonFormat.merge(inputStream, builder);
      log.info("traceData:" + builder.build());
  }

  @RequestMapping(method = RequestMethod.POST, value = "/v1/metrics", headers = "content-type=application/json")
  public void otlpJsonMetrics(InputStream inputStream) throws IOException {
      MetricsData.Builder builder = MetricsData.newBuilder();
      jsonFormat.merge(inputStream, builder);
      log.info("metricsData:" + builder.build());
  }
}
