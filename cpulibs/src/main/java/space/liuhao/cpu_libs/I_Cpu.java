package space.liuhao.cpu_libs;

/**
 * Cpu工具类接口定义文件
 *
 * @author 刘浩 2015-03-26 21:28
 * @version 1.0.0
 */
@SuppressWarnings("unused")
public interface I_Cpu{
    /**
     * 获取Cpu核心数
     *
     * @return 当前设备的Cpu核心数
     */
    int countCpuKernelNumber();
}
