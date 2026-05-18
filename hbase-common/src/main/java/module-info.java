 /*
  * Licensed to the Apache Software Foundation (ASF) under one
  * or more contributor license agreements.  See the NOTICE file
  * distributed with this work for additional information
  * regarding copyright ownership.  The ASF licenses this file
  * to you under the Apache License, Version 2.0 (the
  * "License"); you may not use this file except in compliance
  * with the License.  You may obtain a copy of the License at
  *
  *     http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */

 module org.apache.hadoop.hbase.common {
   requires java.management;
   requires java.naming;
   requires java.security.sasl;

   requires org.apache.hadoop.hbase.logging;

   requires org.apache.commons.codec;
   requires org.apache.commons.io;
   requires org.apache.commons.lang3;
   requires commons.crypto;
   requires commons.validator;

   requires hadoop.common;
   requires hbase.unsafe;
   requires zookeeper;

   requires io.opentelemetry.api;
   requires io.opentelemetry.context;
   requires io.opentelemetry.semconv;

   requires org.slf4j;

   requires com.google.errorprone.annotations;
   requires static audience.annotations;
   requires static findbugs.annotations;


   // Exports
   exports org.apache.hadoop.hbase;
   exports org.apache.hadoop.hbase.backup;
   //  exports org.apache.hadoop.hbase.backup to hbase.backup;
   exports org.apache.hadoop.hbase.codec;
   exports org.apache.hadoop.hbase.conf;
   //  exports org.apache.hadoop.hbase.conf to hbase.server, hbase.asyncfs, hbase.replication, hbase.balancer;
   exports org.apache.hadoop.hbase.exceptions;
   exports org.apache.hadoop.hbase.filter;
   //  exports org.apache.hadoop.hbase.filter to hbase.client, hbase.rest, hbase.server;
   exports org.apache.hadoop.hbase.io;
   exports org.apache.hadoop.hbase.keymeta;
   exports org.apache.hadoop.hbase.log;
   exports org.apache.hadoop.hbase.net;
   exports org.apache.hadoop.hbase.nio;
   exports org.apache.hadoop.hbase.rsgroup;
   exports org.apache.hadoop.hbase.security;
   exports org.apache.hadoop.hbase.trace;
   exports org.apache.hadoop.hbase.types;
   exports org.apache.hadoop.hbase.util;
   exports org.apache.hadoop.hbase.zookeeper;
 }
