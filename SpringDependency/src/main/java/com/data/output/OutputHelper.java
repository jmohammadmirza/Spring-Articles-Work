package com.data.output;

import com.data.output.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;
	
	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via Setter 
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
	//DI via Constructor
   public  OutputHelper(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}
