#!/usr/bin/env bash
set -euo pipefail

# 演示在受限网络环境中，如何安装并运行仓库内的小工具。
# 说明：--no-build-isolation 可避免 pip 为构建隔离环境在线拉取依赖。
python -m pip install --no-build-isolation ./tools/offline-checker
offline-check --name demo
