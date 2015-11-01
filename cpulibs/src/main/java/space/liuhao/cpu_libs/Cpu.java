package space.liuhao.cpu_libs;


import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/**
 * Cpu工具接口实现类
 *
 * @author 刘浩 2015-03-26 21:06
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public class Cpu implements I_Cpu{
    @Override
    public int countCpuKernelNumber(){
        //获取Cpu信息文件目录
        File dir = new File("/sys/devices/system/cpu/");
        //Filter to only list the devices we care about
        File[] files = dir.listFiles(new CpuKernelFileFilter());
        //Return the number of cores (virtual CPU devices)
        return files.length;
    }

    /**
     * cpu核心文件过滤器
     */
    class CpuKernelFileFilter implements FileFilter{
        @Override
        public boolean accept(File pathname){
            return Pattern.matches("cpu[0-9]", pathname.getName());
        }
    }
}
