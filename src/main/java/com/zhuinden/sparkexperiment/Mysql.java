package com.zhuinden.sparkexperiment;

import java.util.List;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mysql {

	 @Autowired
	 private SparkSession sparkSession;
	 
	 @Autowired
	 private JavaSparkContext jsc;


}
