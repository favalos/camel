/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.flink.FlinkComponent;

/**
 * Send DataSet jobs to an Apache Flink cluster.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface FlinkComponentBuilderFactory {

    /**
     * Flink (camel-flink)
     * Send DataSet jobs to an Apache Flink cluster.
     * 
     * Category: transformation,bigdata,streams
     * Since: 2.18
     * Maven coordinates: org.apache.camel:camel-flink
     */
    static FlinkComponentBuilder flink() {
        return new FlinkComponentBuilderImpl();
    }

    /**
     * Builder for the Flink component.
     */
    interface FlinkComponentBuilder extends ComponentBuilder<FlinkComponent> {
        /**
         * DataSet to compute against.
         * 
         * The option is a: <code>org.apache.flink.api.java.DataSet</code> type.
         * 
         * Group: producer
         */
        default FlinkComponentBuilder dataSet(
                org.apache.flink.api.java.DataSet dataSet) {
            doSetProperty("dataSet", dataSet);
            return this;
        }
        /**
         * Function performing action against a DataSet.
         * 
         * The option is a:
         * <code>org.apache.camel.component.flink.DataSetCallback</code> type.
         * 
         * Group: producer
         */
        default FlinkComponentBuilder dataSetCallback(
                org.apache.camel.component.flink.DataSetCallback dataSetCallback) {
            doSetProperty("dataSetCallback", dataSetCallback);
            return this;
        }
        /**
         * DataStream to compute against.
         * 
         * The option is a:
         * <code>org.apache.flink.streaming.api.datastream.DataStream</code>
         * type.
         * 
         * Group: producer
         */
        default FlinkComponentBuilder dataStream(
                org.apache.flink.streaming.api.datastream.DataStream dataStream) {
            doSetProperty("dataStream", dataStream);
            return this;
        }
        /**
         * Function performing action against a DataStream.
         * 
         * The option is a:
         * <code>org.apache.camel.component.flink.DataStreamCallback</code>
         * type.
         * 
         * Group: producer
         */
        default FlinkComponentBuilder dataStreamCallback(
                org.apache.camel.component.flink.DataStreamCallback dataStreamCallback) {
            doSetProperty("dataStreamCallback", dataStreamCallback);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default FlinkComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default FlinkComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
    }

    class FlinkComponentBuilderImpl
            extends
                AbstractComponentBuilder<FlinkComponent>
            implements
                FlinkComponentBuilder {
        @Override
        protected FlinkComponent buildConcreteComponent() {
            return new FlinkComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "dataSet": ((FlinkComponent) component).setDataSet((org.apache.flink.api.java.DataSet) value); return true;
            case "dataSetCallback": ((FlinkComponent) component).setDataSetCallback((org.apache.camel.component.flink.DataSetCallback) value); return true;
            case "dataStream": ((FlinkComponent) component).setDataStream((org.apache.flink.streaming.api.datastream.DataStream) value); return true;
            case "dataStreamCallback": ((FlinkComponent) component).setDataStreamCallback((org.apache.camel.component.flink.DataStreamCallback) value); return true;
            case "lazyStartProducer": ((FlinkComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((FlinkComponent) component).setBasicPropertyBinding((boolean) value); return true;
            default: return false;
            }
        }
    }
}