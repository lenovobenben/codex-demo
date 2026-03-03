# 离线小工具演示（本仓库内安装）

当外网受限（例如 pip 无法访问 PyPI）时，可以把小工具源码直接放在仓库里，
再通过本地路径安装。

## 一次性命令

```bash
python -m pip install --no-build-isolation ./tools/offline-checker
offline-check --name demo
```

> 为什么加 `--no-build-isolation`？
>
> 避免 pip 创建隔离构建环境时在线下载构建依赖，适合离线/受限网络场景。

## 脚本方式

```bash
./scripts/demo-offline-tool.sh
```

## 预期输出

```text
[offline-check] ok name=demo time=<UTC时间>
```
