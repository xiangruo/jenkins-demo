#! /usr/bin/env bash
cat password.txt|docker login --username=xiangruo2020 --password-stdin  registry.cn-beijing.aliyuncs.com
docker tag 61192fdab235 registry.cn-beijing.aliyuncs.com/xiangruo/xiangruo-jinkens-demo:0.01
docker push registry.cn-beijing.aliyuncs.com/xiangruo/xiangruo-jinkens-demo:0.01