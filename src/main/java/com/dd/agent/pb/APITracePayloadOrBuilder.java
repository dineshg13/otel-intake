// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/protos/trace.proto

package com.dd.agent.pb;

public interface APITracePayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pb.APITracePayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hostName = 1;</code>
   * @return The hostName.
   */
  java.lang.String getHostName();
  /**
   * <code>string hostName = 1;</code>
   * @return The bytes for hostName.
   */
  com.google.protobuf.ByteString
      getHostNameBytes();

  /**
   * <code>string env = 2;</code>
   * @return The env.
   */
  java.lang.String getEnv();
  /**
   * <code>string env = 2;</code>
   * @return The bytes for env.
   */
  com.google.protobuf.ByteString
      getEnvBytes();

  /**
   * <code>repeated .pb.APITrace traces = 3;</code>
   */
  java.util.List<com.dd.agent.pb.APITrace> 
      getTracesList();
  /**
   * <code>repeated .pb.APITrace traces = 3;</code>
   */
  com.dd.agent.pb.APITrace getTraces(int index);
  /**
   * <code>repeated .pb.APITrace traces = 3;</code>
   */
  int getTracesCount();
  /**
   * <code>repeated .pb.APITrace traces = 3;</code>
   */
  java.util.List<? extends com.dd.agent.pb.APITraceOrBuilder> 
      getTracesOrBuilderList();
  /**
   * <code>repeated .pb.APITrace traces = 3;</code>
   */
  com.dd.agent.pb.APITraceOrBuilder getTracesOrBuilder(
      int index);

  /**
   * <code>repeated .pb.APISpan transactions = 4;</code>
   */
  java.util.List<com.dd.agent.pb.APISpan> 
      getTransactionsList();
  /**
   * <code>repeated .pb.APISpan transactions = 4;</code>
   */
  com.dd.agent.pb.APISpan getTransactions(int index);
  /**
   * <code>repeated .pb.APISpan transactions = 4;</code>
   */
  int getTransactionsCount();
  /**
   * <code>repeated .pb.APISpan transactions = 4;</code>
   */
  java.util.List<? extends com.dd.agent.pb.APISpanOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <code>repeated .pb.APISpan transactions = 4;</code>
   */
  com.dd.agent.pb.APISpanOrBuilder getTransactionsOrBuilder(
      int index);

  /**
   * <code>repeated .pb.APITracerPayload tracerPayloads = 5;</code>
   */
  java.util.List<com.dd.agent.pb.APITracerPayload> 
      getTracerPayloadsList();
  /**
   * <code>repeated .pb.APITracerPayload tracerPayloads = 5;</code>
   */
  com.dd.agent.pb.APITracerPayload getTracerPayloads(int index);
  /**
   * <code>repeated .pb.APITracerPayload tracerPayloads = 5;</code>
   */
  int getTracerPayloadsCount();
  /**
   * <code>repeated .pb.APITracerPayload tracerPayloads = 5;</code>
   */
  java.util.List<? extends com.dd.agent.pb.APITracerPayloadOrBuilder> 
      getTracerPayloadsOrBuilderList();
  /**
   * <code>repeated .pb.APITracerPayload tracerPayloads = 5;</code>
   */
  com.dd.agent.pb.APITracerPayloadOrBuilder getTracerPayloadsOrBuilder(
      int index);

  /**
   * <code>map&lt;string, string&gt; tags = 6;</code>
   */
  int getTagsCount();
  /**
   * <code>map&lt;string, string&gt; tags = 6;</code>
   */
  boolean containsTags(
      java.lang.String key);
  /**
   * Use {@link #getTagsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTags();
  /**
   * <code>map&lt;string, string&gt; tags = 6;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTagsMap();
  /**
   * <code>map&lt;string, string&gt; tags = 6;</code>
   */
  /* nullable */
java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; tags = 6;</code>
   */
  java.lang.String getTagsOrThrow(
      java.lang.String key);

  /**
   * <code>string agentVersion = 7;</code>
   * @return The agentVersion.
   */
  java.lang.String getAgentVersion();
  /**
   * <code>string agentVersion = 7;</code>
   * @return The bytes for agentVersion.
   */
  com.google.protobuf.ByteString
      getAgentVersionBytes();
}
