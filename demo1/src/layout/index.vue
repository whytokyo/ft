<template>

  <el-container class="demo">
    <side-bar/>
    <main-body/>
  </el-container>
</template>

<script setup>
import SideBar from './sidebar/index.vue'
import MainBody from './main/index.vue'
</script>

<style scoped>
.demo .el-container {
  margin: fill;
  width: 100%;
}
</style>
