<template>
  <section class="relative bg-gradient-to-r from-primary to-primary/80 text-white py-12 md:py-20 overflow-hidden">
    <div class="absolute inset-0 opacity-10">
      <div class="absolute -right-10 -top-10 w-60 h-60 rounded-full bg-white"></div>
      <div class="absolute right-20 bottom-5 w-32 h-32 rounded-full bg-white"></div>
      <div class="absolute left-10 top-1/2 w-40 h-40 rounded-full bg-white"></div>
    </div>
    
    <div class="container mx-auto px-4 sm:px-6 lg:px-8 relative z-10">
      <div class="max-w-3xl mx-auto text-center">
        <h1 class="text-[clamp(2rem,5vw,3.5rem)] font-bold leading-tight mb-4">
          全球科技新闻资讯平台
        </h1>
        <p class="text-[clamp(1rem,2vw,1.25rem)] text-white/90 mb-8 max-w-2xl mx-auto">
          实时掌握全球科技动态，深度解析前沿产品趋势
        </p>
        <div class="flex flex-wrap justify-center gap-4">
          <Button 
            type="primary" 
            size="large"
            class="bg-white text-primary hover:bg-neutral-100 shadow-lg hover:shadow-xl transition-all transform hover:-translate-y-1"
          >
            浏览最新资讯
          </Button>
          <Button 
            type="primary" 
            size="large"
            class="bg-transparent border-2 border-white text-white hover:bg-white/10 transition-all transform hover:-translate-y-1"
          >
            探索产品详情
          </Button>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>
import { Button } from 'ant-design-vue'
</script>

<style scoped>
.from-primary {
  background-color: #165DFF;
}

.to-primary\/80 {
  background-color: rgba(22, 93, 255, 0.8);
}

.text-white\/90 {
  color: rgba(255, 255, 255, 0.9);
}

.bg-white {
  background-color: #ffffff !important;
}

.text-primary {
  color: #165DFF !important;
}
</style>
