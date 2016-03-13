package code;


@code.Alternative(featureName = "ConexionDB")
public class ConexionDB {
    public ConexionDB() {
    }
    
    @code.OptionFeature(featureName = "MysqlRDB")
    private void MysqlRDB() {
    }
    
    @code.OptionFeature(featureName = "MongoNoSQL")
    private void MongoNoSQL() {
    }
    
}

