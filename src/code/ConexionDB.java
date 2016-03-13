package code;

@Alternative(featureName="ConexionDB")
public class ConexionDB {
	
	public ConexionDB(){}

	@OptionFeature(featureName="MysqlRDB")
	private void MysqlRDB(){

	}
	
	@OptionFeature(featureName="MongoNoSQL")
	private void MongoNoSQL(){

	}
}
