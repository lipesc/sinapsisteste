import { createApp } from 'vue'
import './style.css'
import App from './App.vue'
import Toast from "vue-toastification"
import "vue-toastification/dist/index.css"

const options = {
  // toasts
};
const app = createApp(App);
//createApp(App).mount('#app')

app.use(Toast);
app.mount("#app");