package javaLibModel;

import org.tensorflow.SavedModelBundle;
import org.tensorflow.Session;
import org.tensorflow.Tensor;

public class FastTextModel {
    SavedModelBundle tensorflowModelBundle;
    Session tensorflowSession;

    void load(String modelPath){
        this.tensorflowModelBundle = SavedModelBundle.load(modelPath, "serve");
        this.tensorflowSession = tensorflowModelBundle.session();
    }

    public Tensor predict(Tensor tensorInput){
        Tensor output = this.tensorflowSession.runner().
                feed("input_x", tensorInput).fetch("score").run().get(0);

        return output;
    }

    public static void main(String[] args){
        int[][] testvec = new int[1][50];
        for(int i=0; i<50; i++){
            testvec[0][i] = i;
        }
        Tensor input = Tensor.create(testvec);
        FastTextModel myModel = new FastTextModel();
        String modelPath = "Your pb model dir path";
        myModel.load(modelPath);
        Tensor out = myModel.predict(input);
        float[][] resultValues = (float[][]) out.copyTo(new float[1][10]);
        // 防止内存泄漏, 主动释放内存
        input.close();
        out.close();

        for(int i=0; i< 10; i++) {
            System.out.println(resultValues[0][i]);
        }
    }
}
