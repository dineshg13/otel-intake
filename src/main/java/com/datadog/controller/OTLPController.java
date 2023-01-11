package com.datadog.controller;

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

  @RequestMapping(method = RequestMethod.POST, value = "/v1/traces")
  public void otlpTraces(InputStream inputStream) throws IOException {
    BufferedInputStream in = new BufferedInputStream(inputStream);
    TracesData tracesData = TracesData.parseFrom(in.readAllBytes());
    log.info("traceData:" + tracesData);
  }

  @RequestMapping(method = RequestMethod.POST, value = "/v1/metrics")
  public void otlpMetrics(InputStream inputStream) throws IOException {
    BufferedInputStream in = new BufferedInputStream(inputStream);
    MetricsData metricsData = MetricsData.parseFrom(in.readAllBytes());
    log.info("metricsData:" + metricsData);
  }
}
