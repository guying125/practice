const { defineConfig } = require('@vue/cli-service');
module.exports = defineConfig({
  publicPath: "./",
  devServer: {
    // 前端启动端口
    port: 8090,
    https: false,
    open: false,
    proxy: {
      "/": {
        target: "http://localhost:8080"
      }
    },
    headers: {
      // 允许应用跨域
      "Access-Control-Allow-Origin": "*"
    }
  },
  transpileDependencies: true
})
